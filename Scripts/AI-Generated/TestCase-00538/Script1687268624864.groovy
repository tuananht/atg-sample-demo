import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-cases-failed-reason-com-kms-katalon-core-exception-stepfailedexception-unable-to-select-option-by-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-cases-failed-reason-com-kms-katalon-core-exception-stepfailedexception-unable-to-select-option-by-value/47726/2')

'step 2: Add visual checkpoint at Page_t_test-cases-failed-reason-com-kms-katalon-core-exception-stepfailedexception-unable-to-select-option-by-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00538_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
