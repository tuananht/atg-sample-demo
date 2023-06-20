import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-url-is-invalid-for-soap-wsdl'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-url-is-invalid-for-soap-wsdl/12962')

'step 2: Add visual checkpoint at Page_t_error-url-is-invalid-for-soap-wsdl'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00845_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
