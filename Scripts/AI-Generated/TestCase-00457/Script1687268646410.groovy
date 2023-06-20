import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-run-katalon-test-suites-from-command-prompt-for-ci-cd'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-run-katalon-test-suites-from-command-prompt-for-ci-cd/13158')

'step 2: Add visual checkpoint at Page_t_how-can-i-run-katalon-test-suites-from-command-prompt-for-ci-cd'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00457_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
