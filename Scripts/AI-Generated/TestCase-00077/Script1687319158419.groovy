import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_add-a-file-to-report-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/add-a-file-to-report-folder/62379/4')

'step 2: Add visual checkpoint at Page_t_add-a-file-to-report-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00077_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()