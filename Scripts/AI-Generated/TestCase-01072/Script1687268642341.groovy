import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-recorder-it-does-not-fill-input-field-test-card-number-with-spaces'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-recorder-it-does-not-fill-input-field-test-card-number-with-spaces/50517')

'step 2: Add visual checkpoint at Page_t_katalon-recorder-it-does-not-fill-input-field-test-card-number-with-spaces'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01072_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
