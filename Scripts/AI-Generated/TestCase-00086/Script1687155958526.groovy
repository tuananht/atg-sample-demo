import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-switch-the-driver-to-webview-mode-root-cause-cannot-find-any-webview-to-switch-to'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-switch-the-driver-to-webview-mode-root-cause-cannot-find-any-webview-to-switch-to/14355')

'step 2: Add visual checkpoint at Page_t_unable-to-switch-the-driver-to-webview-mode-root-cause-cannot-find-any-webview-to-switch-to'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00086_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
