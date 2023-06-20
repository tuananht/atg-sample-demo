import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-read-toast-message-in-40'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-read-toast-message-in-android/11191/40')

'step 2: Add visual checkpoint at Page_t_how-to-read-toast-message-in-40'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01081_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
