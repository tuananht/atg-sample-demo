import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_ipa-vs-app-files-differences-for-ios-mobile-testing-on-simulator'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/ipa-vs-app-files-differences-for-ios-mobile-testing-on-simulator/24626')

'step 2: Add visual checkpoint at Page_t_ipa-vs-app-files-differences-for-ios-mobile-testing-on-simulator'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00290_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
