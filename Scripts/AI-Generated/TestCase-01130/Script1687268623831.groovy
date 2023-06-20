import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/83934/4')

'step 2: Add visual checkpoint at Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01130_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
