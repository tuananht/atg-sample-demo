import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-capture-second-window-using-windows-recorder'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-capture-second-window-using-windows-recorder/49264')

'step 2: Add visual checkpoint at Page_t_unable-to-capture-second-window-using-windows-recorder'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00227_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
