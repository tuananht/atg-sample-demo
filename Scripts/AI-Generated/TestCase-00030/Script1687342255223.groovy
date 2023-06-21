import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_spiratest-support-for-automation-test-result-update-with-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/spiratest-support-for-automation-test-result-update-with-katalon/24981')

'step 2: Add visual checkpoint at Page_t_spiratest-support-for-automation-test-result-update-with-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00030_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
