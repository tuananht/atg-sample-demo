import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_when-testing-payment-gateways-web-errors-occur-when-running-the-test-secured-objects-capturing-errors-in-input-card-number-and-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/when-testing-payment-gateways-web-errors-occur-when-running-the-test-secured-objects-capturing-errors-in-input-card-number-and-other/85147/7')

'step 2: Add visual checkpoint at Page_t_when-testing-payment-gateways-web-errors-occur-when-running-the-test-secured-objects-capturing-errors-in-input-card-number-and-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01305_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
