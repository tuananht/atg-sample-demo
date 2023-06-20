import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_chrome-cannot-exclude-some-command-line-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/chrome-cannot-exclude-some-command-line-switches/8380/2')

'step 2: Add visual checkpoint at Page_t_chrome-cannot-exclude-some-command-line-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01367_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
