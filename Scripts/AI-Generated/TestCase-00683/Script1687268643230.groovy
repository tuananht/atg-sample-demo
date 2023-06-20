import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-capture-objects-using-object-spy-for-chrome-and-firefox'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-capture-objects-using-object-spy-for-chrome-and-firefox/12152')

'step 2: Add visual checkpoint at Page_t_unable-to-capture-objects-using-object-spy-for-chrome-and-firefox'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00683_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
