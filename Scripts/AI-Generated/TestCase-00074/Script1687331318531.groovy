import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-you-start-a-mobile-remote-session-with-the-project-setting-desired-capabilities'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-you-start-a-mobile-remote-session-with-the-project-setting-desired-capabilities/78732')

'step 2: Add visual checkpoint at Page_t_how-can-you-start-a-mobile-remote-session-with-the-project-setting-desired-capabilities'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00074_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
