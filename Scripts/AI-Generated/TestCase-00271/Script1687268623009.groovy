import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-click-tap-on-a-button-in-android-webview'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-click-tap-on-a-button-in-android-webview/20135')

'step 2: Add visual checkpoint at Page_t_unable-to-click-tap-on-a-button-in-android-webview'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00271_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
