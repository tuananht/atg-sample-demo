import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-do-i-get-cucumber-scenario-names-at-run-time-i-want-to-send-scenario-names-to-browserstack-so-that-i-can-see-logs-against-scenario-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-do-i-get-cucumber-scenario-names-at-run-time-i-want-to-send-scenario-names-to-browserstack-so-that-i-can-see-logs-against-scenario-names/21338/3')

'step 2: Add visual checkpoint at Page_t_how-do-i-get-cucumber-scenario-names-at-run-time-i-want-to-send-scenario-names-to-browserstack-so-that-i-can-see-logs-against-scenario-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01383_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
