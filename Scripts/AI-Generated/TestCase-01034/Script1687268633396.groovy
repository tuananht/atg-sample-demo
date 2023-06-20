import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_submit-button-is-being-clicked-but-seems-to-be-stopping-action'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/submit-button-is-being-clicked-but-seems-to-be-stopping-action/78476')

'step 2: Add visual checkpoint at Page_t_submit-button-is-being-clicked-but-seems-to-be-stopping-action'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01034_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
