import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_choose-automation-test-cases'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/choose-automation-test-cases')

'step 2: Add visual checkpoint at Page_resources-center_blog_choose-automation-test-cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00131_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
