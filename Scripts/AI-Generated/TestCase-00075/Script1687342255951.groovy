import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_exception-error-code-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/exception-error-code-32000/90771/3')

'step 2: Add visual checkpoint at Page_t_exception-error-code-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00075_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
