import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-connect-katalon-studio-to-visual-studio-emulator'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-connect-katalon-studio-to-visual-studio-emulator/29802')

'step 2: Add visual checkpoint at Page_t_how-to-connect-katalon-studio-to-visual-studio-emulator'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00242_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
