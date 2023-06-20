import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_after-add-duplicate-test-cases-in-single-test-suite-getting-invalid-test-suite-error-while-execution-of-test-suite'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/after-add-duplicate-test-cases-in-single-test-suite-getting-invalid-test-suite-error-while-execution-of-test-suite/15410')

'step 2: Add visual checkpoint at Page_t_after-add-duplicate-test-cases-in-single-test-suite-getting-invalid-test-suite-error-while-execution-of-test-suite'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00965_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
