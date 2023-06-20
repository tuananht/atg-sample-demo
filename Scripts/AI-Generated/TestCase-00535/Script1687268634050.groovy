import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_windows-uwp-app-testing-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/windows-uwp-app-testing-possible/42829/7')

'step 2: Add visual checkpoint at Page_t_windows-uwp-app-testing-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00535_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
