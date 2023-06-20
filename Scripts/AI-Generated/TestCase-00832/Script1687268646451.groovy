import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-studio-not-responding-during-android-app-test-case-recording-on-loading-screens-cordova-app-using-vue'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-studio-not-responding-during-android-app-test-case-recording-on-loading-screens-cordova-app-using-vue/87149')

'step 2: Add visual checkpoint at Page_t_katalon-studio-not-responding-during-android-app-test-case-recording-on-loading-screens-cordova-app-using-vue'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00832_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
