import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_unit-testing-integration-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/unit-testing-integration-testing')

'step 2: Add visual checkpoint at Page_resources-center_blog_unit-testing-integration-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00123_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
