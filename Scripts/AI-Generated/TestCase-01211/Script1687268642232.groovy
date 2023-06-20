import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_web-chrome-specified-profile-in-the-desired-capabilities-does-not-take-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/web-chrome-specified-profile-in-the-desired-capabilities-does-not-take-effect/87018/2')

'step 2: Add visual checkpoint at Page_t_web-chrome-specified-profile-in-the-desired-capabilities-does-not-take-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01211_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
