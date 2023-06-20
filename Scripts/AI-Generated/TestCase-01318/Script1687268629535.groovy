import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-analytics-bug-was-help-suite-running-multiple-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-analytics-bug-was-help-suite-running-multiple-times/34622/5')

'step 2: Add visual checkpoint at Page_t_katalon-analytics-bug-was-help-suite-running-multiple-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01318_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
