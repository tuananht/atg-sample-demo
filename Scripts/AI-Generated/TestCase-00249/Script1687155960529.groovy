import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-launch-an-installed-app-using-katalon-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-launch-an-installed-app-using-katalon-studio/15468/5')

'step 2: Add visual checkpoint at Page_t_how-to-launch-an-installed-app-using-katalon-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00249_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
