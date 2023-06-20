import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-count-iframe-elements-how-to-specify-an-iframe-if-xpath-is-defined-within-driver-findelements-method'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-count-iframe-elements-how-to-specify-an-iframe-if-xpath-is-defined-within-driver-findelements-method/83848')

'step 2: Add visual checkpoint at Page_t_how-to-count-iframe-elements-how-to-specify-an-iframe-if-xpath-is-defined-within-driver-findelements-method'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00930_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
