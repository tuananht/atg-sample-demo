import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_what-is-best-practice-for-writing-to-console-log'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/what-is-best-practice-for-writing-to-console-log/18010')

'step 2: Add visual checkpoint at Page_t_what-is-best-practice-for-writing-to-console-log'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00139_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
