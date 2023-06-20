import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cucumber-scenario-passed-while-test-case-step-failed'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cucumber-scenario-passed-while-test-case-step-failed/44729')

'step 2: Add visual checkpoint at Page_t_cucumber-scenario-passed-while-test-case-step-failed'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01075_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
