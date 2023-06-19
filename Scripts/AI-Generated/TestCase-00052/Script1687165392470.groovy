import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token/30707')

'step 2: Add visual checkpoint at Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00052_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
