import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_request-integration-with-youtrack'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/request-integration-with-youtrack/26358')

'step 2: Add visual checkpoint at Page_t_request-integration-with-youtrack'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01076_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
