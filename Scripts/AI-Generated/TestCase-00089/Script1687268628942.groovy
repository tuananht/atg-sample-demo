import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-let-testcases-in-a-testsuite-to-quit-once-a-testcase-failed'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-let-testcases-in-a-testsuite-to-quit-once-a-testcase-failed/60404')

'step 2: Add visual checkpoint at Page_t_how-to-let-testcases-in-a-testsuite-to-quit-once-a-testcase-failed'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00089_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
