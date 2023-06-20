import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_automation-tester-resume'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/automation-tester-resume')

'step 2: Add visual checkpoint at Page_resources-center_blog_automation-tester-resume'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00173_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
