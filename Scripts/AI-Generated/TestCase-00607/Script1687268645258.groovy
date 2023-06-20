import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_logging-http-response-headers-and-bodies-of-web-service-materials-applied'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/logging-http-response-headers-and-bodies-of-web-service-materials-applied/13803')

'step 2: Add visual checkpoint at Page_t_logging-http-response-headers-and-bodies-of-web-service-materials-applied'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00607_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
