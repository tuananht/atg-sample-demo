import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-drop-and-drag-files-from-windows-explorer'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-drop-and-drag-files-from-windows-explorer/42276')

'step 2: Add visual checkpoint at Page_t_how-to-drop-and-drag-files-from-windows-explorer'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00395_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
