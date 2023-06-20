import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-want-to-edit-two-lines-of-text-including-line-breaks'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-want-to-edit-two-lines-of-text-including-line-breaks/81631')

'step 2: Add visual checkpoint at Page_t_i-want-to-edit-two-lines-of-text-including-line-breaks'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00933_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
