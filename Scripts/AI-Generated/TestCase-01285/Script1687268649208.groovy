import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-call-another-test-case-within-a-test-case-in-katalon-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-call-another-test-case-within-a-test-case-in-katalon-recorder/44561/2')

'step 2: Add visual checkpoint at Page_t_how-can-i-call-another-test-case-within-a-test-case-in-katalon-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01285_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
