import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_javascript-executer-to-perform-click-but-step-doesnt-pass-even-though-button-is-clicked'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/javascript-executer-to-perform-click-but-step-doesnt-pass-even-though-button-is-clicked/19407')

'step 2: Add visual checkpoint at Page_t_javascript-executer-to-perform-click-but-step-doesnt-pass-even-though-button-is-clicked'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00623_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
