import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-try-to-run-suitecollection-it-doesnt-run'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-try-to-run-suitecollection-it-doesnt-run/45826')

'step 2: Add visual checkpoint at Page_t_i-try-to-run-suitecollection-it-doesnt-run'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00881_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
