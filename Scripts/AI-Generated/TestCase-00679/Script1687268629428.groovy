import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_turnoff-microsoft-edge-is-being-controlled-by-automated-test-software'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/turnoff-microsoft-edge-is-being-controlled-by-automated-test-software/79615')

'step 2: Add visual checkpoint at Page_t_turnoff-microsoft-edge-is-being-controlled-by-automated-test-software'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00679_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
