import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_validating-pdf-getting-end-of-file-error-exception'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/validating-pdf-getting-end-of-file-error-exception/34800')

'step 2: Add visual checkpoint at Page_t_validating-pdf-getting-end-of-file-error-exception'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01061_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
