import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-determine-the-number-of-opend-browser-windows-or-to-iterate-between-them'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-determine-the-number-of-opend-browser-windows-or-to-iterate-between-them/14357')

'step 2: Add visual checkpoint at Page_t_how-to-determine-the-number-of-opend-browser-windows-or-to-iterate-between-them'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00014_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
