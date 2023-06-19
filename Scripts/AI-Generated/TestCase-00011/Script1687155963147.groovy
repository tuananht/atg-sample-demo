import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_console-mode-errors-on-only-25-of-device-unable-to-start-app'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/console-mode-errors-on-only-25-of-device-unable-to-start-app/11070')

'step 2: Add visual checkpoint at Page_t_console-mode-errors-on-only-25-of-device-unable-to-start-app'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00011_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
