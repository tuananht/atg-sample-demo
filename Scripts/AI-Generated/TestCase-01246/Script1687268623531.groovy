import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-run-re-run-failed-testcases-if-the-testcase-has-been-divided-into-more-than-one-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-run-re-run-failed-testcases-if-the-testcase-has-been-divided-into-more-than-one-file/63201/3')

'step 2: Add visual checkpoint at Page_t_how-to-run-re-run-failed-testcases-if-the-testcase-has-been-divided-into-more-than-one-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01246_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
