import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-retrieve-os-browser-and-screen-resolution-of-the-machine-performing-my-test-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-retrieve-os-browser-and-screen-resolution-of-the-machine-performing-my-test-suite/11001/3')

'step 2: Add visual checkpoint at Page_t_how-to-retrieve-os-browser-and-screen-resolution-of-the-machine-performing-my-test-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00145_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
