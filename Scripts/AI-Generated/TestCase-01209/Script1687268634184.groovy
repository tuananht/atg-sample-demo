import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_windows-testing-with-necessary-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/windows-testing-with-necessary-reboots/88039/6')

'step 2: Add visual checkpoint at Page_t_windows-testing-with-necessary-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01209_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
