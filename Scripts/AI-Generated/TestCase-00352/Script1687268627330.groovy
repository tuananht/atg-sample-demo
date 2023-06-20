import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_could-not-navigate-to-webview'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/could-not-navigate-to-webview/11190')

'step 2: Add visual checkpoint at Page_t_could-not-navigate-to-webview'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00352_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
