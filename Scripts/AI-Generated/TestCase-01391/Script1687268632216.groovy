import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_need-help-need-to-click-on-allow-on-the-notification-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/need-help-need-to-click-on-allow-on-the-notification-popup/54718/5')

'step 2: Add visual checkpoint at Page_t_need-help-need-to-click-on-allow-on-the-notification-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01391_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
