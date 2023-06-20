import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_trouble-with-waiting-until-desktop-app-is-opened-and-splash-screen-is-finished'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/trouble-with-waiting-until-desktop-app-is-opened-and-splash-screen-is-finished/86227')

'step 2: Add visual checkpoint at Page_t_trouble-with-waiting-until-desktop-app-is-opened-and-splash-screen-is-finished'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00480_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
