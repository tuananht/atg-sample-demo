import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-katalon-support-for-multi-language-in-mobile-application-ios'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-katalon-support-for-multi-language-in-mobile-application-ios/9183')

'step 2: Add visual checkpoint at Page_t_is-katalon-support-for-multi-language-in-mobile-application-ios'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00688_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
