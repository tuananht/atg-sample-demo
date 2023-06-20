import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-run-test-on-android-emulator-chrome-browser'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-run-test-on-android-emulator-chrome-browser/68714')

'step 2: Add visual checkpoint at Page_t_unable-to-run-test-on-android-emulator-chrome-browser'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00128_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
