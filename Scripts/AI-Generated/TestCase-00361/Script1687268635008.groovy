import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_offline-activation-fails-with-console-command-through-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/offline-activation-fails-with-console-command-through-ssh/37747/9')

'step 2: Add visual checkpoint at Page_t_offline-activation-fails-with-console-command-through-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00361_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
