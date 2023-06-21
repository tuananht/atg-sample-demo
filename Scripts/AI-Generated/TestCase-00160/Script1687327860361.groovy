import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_software-tester-salary'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/software-tester-salary')

'step 2: Add visual checkpoint at Page_resources-center_blog_software-tester-salary'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00160_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
